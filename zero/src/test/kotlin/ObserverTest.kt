import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.subjects.BehaviorSubject
import org.junit.Before
import org.junit.Test

class ObserverTest {
    private lateinit var disposable: Disposable

    private lateinit var subject: BehaviorSubject<String>

    private val emitDataList = listOf("첫 번째", "두 번째", "세 번째")

    @Before
    fun setUp() {
        subject = BehaviorSubject.create()
    }

    @Test
    fun subjectTest() {
        subject.onNext("안뇽하세욜~~")

        disposable = subject.subscribeBy {
            println(it+"0")
        }

        disposable.dispose()

        assert(disposable.isDisposed)
    }

    @Test
    fun observableTest() {
        disposable = bindData()
            .subscribeBy {
                println(it)
            }
        disposable.dispose()

        assert(disposable.isDisposed)
    }

    private fun bindData() = Observable.create<String> { emiiter ->
        emitDataList.forEach {
            emiiter.onNext(it)
        }
        emiiter.onComplete()
    }
}