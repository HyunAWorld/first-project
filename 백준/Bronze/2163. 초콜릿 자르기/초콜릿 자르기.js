const fs = require('fs')
const [n, m] = fs.readFileSync('/dev/stdin').toString().trim().split(' ')

const solution = (n, m) => {
  return n * m - 1
}
console.log(solution(n, m))