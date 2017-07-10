import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.DoubleSummaryStatistics;

public class PutIntoChangeSet {
    public static void main(String[] args) {
        String line = null;
        String fileName = "./src/changeSet.txt";
        String allLines = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                allLines += line + "\n";
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }

        String usersFile = "./src/users.txt";
        int index = 0;
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



//        System.out.println(allLines);
        int count =1612;
        String changeSet = "";
        String specificUsersArray[] = allLines.split("\n\n");
//        System.out.println(specificUsersArray.length);
        for (int i=0;i<specificUsersArray.length;i++){
            String queryArray[] = specificUsersArray[i].split("\n");
            String userName = queryArray[2];
            String user = "";

            if (i == 0) {
                userName = queryArray[2];
                user = userName.substring(113, userName.length() - 320);
            }else if (i == specificUsersArray.length - 1) {
                for (int j=0;j<queryArray.length;j++){
                    System.out.println(queryArray[j]);
                }
            }
//                userName = queryArray[4];
//                user = userName.substring(114, userName.length() - 320);
//            } else {
//                userName = queryArray[4];
//                user = userName.substring(113, userName.length() - 320);
//            }
            System.out.println(user);
            String line1 = "<changeSet id=\"Amman-20170330" + count++ + "\" author=\"shiva kumar\" context=\"rel2.3\" >\n" +
                    "       <preConditions onFail=\"MARK_RAN\">\n" +
                    "           <sqlCheck expectedResult=\"0\">\n" +
                    "               select count(*) from users where username=\"" + "some" + "\";\n" +
                    "           </sqlCheck>\n" +
                    "       </preConditions>\n" +
                    "       <comment>Adding new user and roles and also pinning forms to user</comment>\n" +
                    "       <sql>\n" + specificUsersArray[i] + "       </sql>\n" +
                    "   </changeSet>";


//            System.out.println(userName);
//            System.out.println(specificUsersArray[i]);
//            System.out.println("\n\n\n\n\n");
        }

//        System.out.println("INSERT INTO users (username, password, salt, creator, date_created, changed_by, person_id,retired,uuid) VALUES (\"".length());
//        System.out.println("\",\"5cf456be925a6b403454ea4bfbf444d406789cf05614bf164068ff29ea648dcea17f9f34137505d8c6dad3d1102bd8832ab34c545353cc47ec0532e7d6d2e938\",\"bb27aaf6dd5590a09923659f89a7c51197273c058947a5bb902bd9a1eb19ed9b68152fc2d7d3e1f5d097b51b0720dac1acddb55a113c806cdeb2949170e9ba1a\",8,now(),8,(SELECT max(person_id) FROM person),0,uuid());".length());
    }

    public String putIntoChangeSet(String lines){
        return "";
    }
}
