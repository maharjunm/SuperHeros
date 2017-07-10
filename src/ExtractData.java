import java.io.*;

class ExtractData {

    static String[] rolesArray = {"Registration-Write","Registration-Read","Clinical:FullAccess","Clinical:ReadOnly","Patients-Document-Upload", "Emr-Reports", "Inpatient-Read","Inpatient-Patient-Movement","Inpatient-Edit-Bed-Tags-Only"};
    public static void main(String[] args) {
        String fileName = "./src/usersData.txt";
        String usersFile = "./src/users.txt";
        String userNamesFile = "./src/userNames.txt";
        String userGendersFile = "./src/usersGender.txt";
        String line = null;

        String[] rolesData = new String[54];
        int index = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                rolesData[index++] = line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        index = 0;
        line = null;
        String[] usersArray = new String[54];
        try {
            FileReader fileReader = new FileReader(usersFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                usersArray[index++] = line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        index = 0;
        String[] usersNamesArray = new String[54];
        try {
            FileReader fileReader = new FileReader(userNamesFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                usersNamesArray[index++] = line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        index = 0;
        String[] usersGendersArray = new String[54];
        try {
            FileReader fileReader = new FileReader(userGendersFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                usersGendersArray[index++] = line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }



        for(int i = 0; i<54;i++) {
            System.out.println(usersNamesArray[i]);
            System.out.println("************************");
            System.out.println(personTableInsert(usersGendersArray[i]));
            System.out.println(personNameInsert(usersNamesArray[i]));
            System.out.println(userTableInsert(usersArray[i]));
            System.out.println("INSERT INTO user_property VALUES ((SELECT max(user_id) from users), \"defaultLocale\",\"en\"),((SELECT max(user_id) from users),\"favouriteObsTemplates\",\"\"),((SELECT max(user_id) from users),\"favouriteWards\",\"\"),((SELECT max(user_id) from users),\"lockoutTimestamp\",\"\"),((SELECT max(user_id) from users),\"loginAttempts\",0),((SELECT max(user_id) from users),\"recentlyViewedPatients\",'[]');");
            System.out.println(returnInsertCommand(rolesData[i]));
            System.out.println("INSERT INTO provider (person_id, creator, date_created, retired, uuid)VALUES ((SELECT max(person_id) FROM person),8,now(),0,uuid());");

            System.out.println("\n\n\n\n\n");
        }

//        System.out.println(returnInsertCommand("no yes yes yes no yes yes yes yes"));
//        System.out.println(personNameInsert("Haya Al Qadi"));

    }

    public static String returnInsertCommand(String line) {
        String accessPermissions[] = line.split(" ");
        String output = "INSERT INTO user_role VALUES ((SELECT max(user_id) from users),\"Bahmni-User\"),";
        for(int i=0;i<accessPermissions.length;i++){
            if(accessPermissions[i].equals("yes")){
                output += "((SELECT max(user_id) from users),\"" + rolesArray[i] + "\")";
            }
            if(i == accessPermissions.length-1){
                output = output.substring(0,output.length());
                output += ";";
            } else if(accessPermissions[i].equals("yes")){
                output += ",";
            }
        }
        return output;
    }


    public static String userTableInsert(String line) {
        return "INSERT INTO users (username, password, salt, creator, date_created, changed_by, person_id,retired,uuid) VALUES (\"" + line +"\",\"5cf456be925a6b403454ea4bfbf444d406789cf05614bf164068ff29ea648dcea17f9f34137505d8c6dad3d1102bd8832ab34c545353cc47ec0532e7d6d2e938\",\"bb27aaf6dd5590a09923659f89a7c51197273c058947a5bb902bd9a1eb19ed9b68152fc2d7d3e1f5d097b51b0720dac1acddb55a113c806cdeb2949170e9ba1a\",8,now(),8,(SELECT max(person_id) FROM person),0,uuid());";
    }

    public static String personTableInsert(String gender) {
        return "INSERT INTO person (gender,creator, date_created, uuid)VALUES (\"" + gender + "\",8,now(),uuid());";
    }


    public static String personNameInsert(String string) {
        int firstSpace = 0;
        for(int i = 0; i<string.length();i++) {
            if(string.charAt(i) == ' ') {
                firstSpace = i;
                break;
            }
        }
        String firstName = string.substring(0, firstSpace);
        String familyName = string.substring(firstSpace + 1);

        return "INSERT INTO person_name (person_id, given_name, family_name,creator, date_created, uuid) VALUES ((SELECT max(person_id) FROM person),\"" + firstName + "\",\"" + familyName + "\",8, now(), uuid());";
    }



}