package tornadofx.tests

import javafx.stage.Stage
import org.junit.Test
import org.testfx.api.FxAssert.verifyThat
import org.testfx.framework.junit.ApplicationTest
import org.testfx.matcher.control.LabeledMatchers.hasText
import tornadofx.testapps.StylesheetErrorTest

class StylesheetErrorTest : ApplicationTest() {

    /**
     * This will cause a stylesheet error, but should not crash the application.
     */
    override fun start(stage: Stage) {
        StylesheetErrorTest().start(stage)
    }

    @Test
    fun shouldStartApplicationWithWrongStylesheetWithoutCrashing() {
        verifyThat(".my-button", hasText("Click here"))
    }

}