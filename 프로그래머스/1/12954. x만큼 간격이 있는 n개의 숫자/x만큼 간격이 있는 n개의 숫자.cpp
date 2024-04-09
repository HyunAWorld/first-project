func solution(_ x:Int, _ n:Int) -> [Int64] {
    var answer = [Int64]()
    
    for zz in (1...n) {
        answer.append(Int64(x*zz))
        }
    return answer
}