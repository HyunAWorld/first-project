func solution(_ s: String) -> String {
    let count = s.count
    let middleIndex = s.index(s.startIndex, offsetBy: count / 2)
    
    if count % 2 == 0 {
        let startIndex = s.index(middleIndex, offsetBy: -1)
        let endIndex = s.index(after: middleIndex)
        return String(s[startIndex..<endIndex])
    } else {
        return String(s[middleIndex])
    }
}