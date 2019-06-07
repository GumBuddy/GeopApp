package android.AngeloAzcorra.com;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TrampaFragment extends Fragment {
    private TextView mrRespuesta;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trampa, container, false);
        mrRespuesta = view.findViewById(R.id.respuesta_textview);
        boolean respuestaEsCorrecta = getActivity().getIntent().getBooleanExtra(GeoFragment.EXTRA_RESPUESTA_ES_CORRECTA, false);
        mrRespuesta.setText(respuestaEsCorrecta ? "Correcto" : "Incorrecto");
        return view;
    }
}
