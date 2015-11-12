package beans;

import beans.util.MobilePageController;
import modelo.Setor;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "setorController")
@ViewScoped
public class SetorController extends AbstractController<Setor> {

    @Inject
    private MobilePageController mobilePageController;

    public SetorController() {
        // Inform the Abstract parent controller of the concrete Setor Entity
        super(Setor.class);
    }

    /**
     * Sets the "items" attribute with a collection of Contato entities that are
     * retrieved from Setor?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Contato page
     */
    public String navigateContatos() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Contato_items", this.getSelected().getContatos());
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/contato/index";
    }

}
