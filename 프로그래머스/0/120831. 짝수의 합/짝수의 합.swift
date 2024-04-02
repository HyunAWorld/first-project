import Foundation

func solution(_ n:Int) -> Int {
    var answer = 0
    for i in stride(from: 2 , through: n, by: 2){
        answer += i
    }
    return answer
}