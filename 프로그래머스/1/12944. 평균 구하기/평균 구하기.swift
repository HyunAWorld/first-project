func solution(_ arr:[Int]) -> Double {
    var average:Double = Double(arr.reduce(0, +)) / Double(arr.count)
    return average
}