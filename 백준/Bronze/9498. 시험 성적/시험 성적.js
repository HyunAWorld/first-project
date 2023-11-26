let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ');

const score = parseInt(input[0]);

if (score < 0 || score > 100) {
    }
  else if (score>=90 && score<=100) {
    console.log ("A");
} else if (score>=80) {
    console.log("B");
} else if (score>=70) {
    console.log("C");
} else if (score>=60) {
    console.log("D");
} else {
    console.log("F");
}