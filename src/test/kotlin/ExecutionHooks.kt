import com.thoughtworks.gauge.AfterSuite
import com.thoughtworks.gauge.BeforeSpec
import com.thoughtworks.gauge.BeforeSuite

class ExecutionHooks {
    @BeforeSuite
    fun beforeSuite() {
        println("before suite!!")
    }
    @AfterSuite
    fun afterSuite() {
        println("after suite!!")
    }
    @BeforeSpec
    fun beforeSpec() {
        println("after spec!!")
    }
}