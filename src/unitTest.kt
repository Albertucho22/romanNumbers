import org.junit.Test
import kotlin.test.assertEquals

class unitTest
{
    @Test
    fun checkEmptyRomanNumber(){

        var value = ""
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(false, expected)

    }

    @Test
    fun checkEmptyRomanNumber2(){

        var value = " "
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(false, expected)

    }
    @Test
    fun checkRomanNumber(){

        var value = "IIIIX"
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(false, expected)

    }

    @Test
    fun checkRomanNumber2(){

        var value = "MMMM"
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(false, expected)

    }

    @Test
    fun checkRomanNumber3(){

        var value = "X"
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(true, expected)

    }

    @Test
    fun checkRomanNumber4(){

        var value = "VI"
        val romanNumber = RomanNumber()
        var expected = romanNumber.check(value)
        assertEquals(true, expected)

    }


}