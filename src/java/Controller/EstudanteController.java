/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author hochforce
 */
public class EstudanteController {

    private Modelo.EstudanteModel model;
    private Visualizacao.EstudanteView view;

    public EstudanteController(Modelo.EstudanteModel model, Visualizacao.EstudanteView view) {
        this.model = model;
        this.view = view;
    }

    public void setEstudanteNome(String nome) {
        model.setNome(nome);
    }

    public String getEstudanteNome() {
        return model.getNome();
    }

    public void setEstudanteId(Integer id) {
        model.setId(id);
    }

    public Integer getEstudanteId() {
        return model.getId();
    }

    public void alterarView() {
        view.imprimeDetalhesEstudante(model.getNome(), model.getId());
    }
}
