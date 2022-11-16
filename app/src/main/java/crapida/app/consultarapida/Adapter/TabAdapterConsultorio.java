package crapida.app.consultarapida.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import crapida.app.consultarapida.fragment.ConsultorioAgendamento;
import crapida.app.consultarapida.fragment.ConsultorioInfo;

/**
 * Created by Fernando on 18/09/2017.
 */

public class TabAdapterConsultorio extends FragmentStatePagerAdapter {

    private String[] tituloAbas = {"INFORMAÇÕES","AGENDAMENTO"};



    public TabAdapterConsultorio(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch ( position ){
            case 0 :
                fragment = new ConsultorioInfo();
                break;
            case 1 :
                fragment = new ConsultorioAgendamento();

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tituloAbas.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tituloAbas[position];
    }
}



