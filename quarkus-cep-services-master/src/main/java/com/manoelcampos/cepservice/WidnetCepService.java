package com.manoelcampos.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public final class WidnetCepService extends AbstractCepService {
    private static final String DOMINIO = "https://apps.widenet.com.br/";


    public WidnetCepService(){
        super(DOMINIO);
    }

    @Override
    protected String buildPath(final String cep) {
        return "busca-cep/api/cep.json?code="+cep;
    }
}
