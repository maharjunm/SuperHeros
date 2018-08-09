function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

function gcd(a, b) {
    if (a >= b) {
        if (a % b === 0) return b;
        return gcd(b, a - b);
    }
    return gcd(b, a);
}

let expressions = ["4/6+2/4", "5/6+7/8", "10/11+12/13", "13/14+15/16"];

findValues(expressions);

function findValues(expressions) {
    let finalvalues = [];
    for (let i = 0; i < expressions.length; i++) {
        let elements = expressions[i].split("+");
        let values = [];
        for (let j = 0; j < elements.length; j++) {
            let arr = elements[j].split("/");
            values.push(parseInt(arr[0]));
            values.push(parseInt(arr[1]));
        }
        let lcmValue = lcm(values[1], values[3]);
        let aValue = values[0] * (lcmValue / values[1]);
        let cValue = values[2] * (lcmValue / values[3]);

        let sum = aValue + cValue;

        let gcdValue = gcd(sum, lcmValue);
        finalvalues.push((sum / gcdValue) + " / " + (lcmValue / gcdValue));
    }
    for(let i = 0 ; i < finalvalues.length;i++) {
        console.log(finalvalues[i]);
    }
    return finalvalues;
}