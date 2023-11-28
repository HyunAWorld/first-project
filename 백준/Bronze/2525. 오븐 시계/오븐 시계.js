let fs = require("fs");
let [current, cookTime] = fs.readFileSync("dev/stdin").toString().split("\n");

let [h, m] = current.split(" ").map(Number);
m += parseInt(cookTime);

if (m >= 60) {
  h = Math.floor(h + m / 60);
  m = m % 60;
  if (h >= 24) {
    h = h % 24;
  }
}

console.log(h + " " + m);

