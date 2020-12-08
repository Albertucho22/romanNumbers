class RomanNumber {
    fun check(value: String): Boolean {
        var pattern = Regex("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})\$")
        if(value.isBlank()){
            return false
        }
        else return pattern.matches(value)
    }

}
