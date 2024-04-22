func solution(_ arr: [Int]) -> [Int] {
    // 배열이 비어있는 경우
    if arr.isEmpty {
        return [-1]
    }
    
    // 가장 작은 수 찾기
    let minVal = arr.min()!
    
    // 가장 작은 수를 제외한 새로운 배열 생성
    let result = arr.filter { $0 != minVal }
    
    return result
}
