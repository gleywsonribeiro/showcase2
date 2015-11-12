package beans;

import beans.util.MobilePageController;
import modelo.Contato;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "contatoController")
@ViewScoped
public class ContatoController extends AbstractController<Contato> {

    @Inject
    private SetorController setorController;
    @Inject
    private MobilePageController mobilePageController;

    public ContatoController() {
        // Inform the Abstract parent controller of the concrete Contato Entity
        super(Contato.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        setorController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Setor controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareSetor(ActionEvent event) {
        if (this.getSelected() != null && setorController.getSelected() == null) {
            setorController.setSelected(this.getSelected().getSetor());
        }
    }
}
