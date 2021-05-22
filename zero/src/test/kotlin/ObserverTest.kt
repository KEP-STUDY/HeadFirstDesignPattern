import observer.LinkedSubject
import observer.Observable
import observer.Subject
import org.junit.Before
import org.junit.Test

class ObserverTest {
    private lateinit var observables: List<Observable>
    private lateinit var subject: Subject<String>

    @Before
    fun setUp() {
        observables = listOf(Observable("첫번째"), Observable("두번째"), Observable("세번째"))
        subject = LinkedSubject()
        observables.forEach {
            subject.attach(it)
        }
    }

    @Test
    fun observerTest() {
        (0..3).forEach {
            subject.emit("$it")
            subject.notifyObservers()
            println()
        }
    }
}