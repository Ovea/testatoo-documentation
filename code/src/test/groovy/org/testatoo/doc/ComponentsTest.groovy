package org.testatoo.doc

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.testatoo.core.component.Button
import org.testatoo.core.component.Image
import org.testatoo.core.component.Panel
import org.testatoo.core.component.field.TextField
import static org.testatoo.core.input.Key.*

import static org.testatoo.core.Testatoo.*

/**
 * @author David Avenante (d.avenante@gmail.com)
 */
@RunWith(JUnit4)
class ComponentsTest {
    @Test
    void should_have_expected_properties_and_states_supported_by_button() {
        Button button = $('') as Button
        // tag::button[]
        button.should { have text('My Button Text') }
        // end::button[]
    }

    @Test
    void should_be_able_to_interact_with_mouse() {
        Button button = $('') as Button
        Image image = $('') as Image
        Panel panel = $('') as Panel

        // tag::mouse[]
        clickOn button
        doubleClickOn button
        rightClickOn button
        hoveringMouseOn button
        drag image on panel
        // end::mouse[]
    }

    @Test
    void should_e_able_to_interact_with_keyboard() {
        // tag::keyboard[]
        type('testatoo') // testatoo
        type(SHIFT + 'testatoo') // => TESTATOO
        type(CTRL + ALT + SHIFT + 'x')
        // end::keyboard[]
    }
}
