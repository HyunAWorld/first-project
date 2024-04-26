func solution(_ left: Int, _ right: Int) -> Int {
    return (left...right).reduce(0) { result, num in
        result + (num.divisorCount.isEven ? num : -num)
    }
}

extension Int {
    var isEven: Bool {
        return self % 2 == 0
    }

    var divisorCount: Int {
        (1...self).filter { self % $0 == 0 }.count
    }
}