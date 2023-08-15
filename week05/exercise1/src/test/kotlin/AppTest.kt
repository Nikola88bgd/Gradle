package example


import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    val bgd = Point(44.8125, 20.4612)
    val syd = Point(33.8688, 151.2093)
    @Test
    fun appPointHasDistanceMethod() {
        val classUnderTest = Point(bgd.x,bgd.y)
        assertNotNull(classUnderTest.distance(syd),"distance() should return distance between two points")
    }
}