import org.junit.jupiter.api.Test
import templateMethodPattern.MathTeacher
import templateMethodPattern.ScienceTeacher

@Suppress("NonAsciiCharacters")
class TeacherTemplateTest {
    val math = MathTeacher()
    val science = ScienceTeacher()

    @Test
    fun `수학수업시간`() {
        math.startClass()
        println("======================")
        science.startClass()
    }

}