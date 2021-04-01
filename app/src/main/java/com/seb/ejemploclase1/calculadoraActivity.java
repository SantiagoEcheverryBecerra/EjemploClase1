package com.seb.ejemploclase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class calculadoraActivity extends AppCompatActivity {

    EditText etProceso, etconcatenar;
    double numero1=0, numero2=0, resultado=0;
    String operador;
    int contador = 0;

    ImageView viewImageAC, viewImageMasMenos, viewImagePorcentaje, viewImageDividido, viewImageMultiplica,
            viewImageResta, viewImageSuma, viewImageIgual, viewImageComa;

    ImageView viewImageCero, viewImageUno, viewImageDos, viewImageTres, viewImageCuatro, viewImageCinco,
            viewImageSeis, viewImageSiete, viewImageOcho, viewImageNueve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        setContentView();

    }
    private void setContentView(){
        viewImageAC= findViewById(R.id.imageAC);
        viewImageMasMenos= findViewById(R.id.imageMasMenos);
        viewImagePorcentaje= findViewById(R.id.imagePorcentaje);
        viewImageDividido= findViewById(R.id.imageDividido);
        viewImageMultiplica= findViewById(R.id.imageMultiplica);
        viewImageResta= findViewById(R.id.imageResta);
        viewImageSuma= findViewById(R.id.imageSuma);
        viewImageComa= findViewById(R.id.imageComa);
        viewImageCero= findViewById(R.id.imageCero);
        viewImageUno= findViewById(R.id.imageUno);
        viewImageDos= findViewById(R.id.imageDos);
        viewImageTres= findViewById(R.id.imageTres);
        viewImageCuatro= findViewById(R.id.imageCuatro);
        viewImageCinco= findViewById(R.id.imageCinco);
        viewImageSeis= findViewById(R.id.imageSeis);
        viewImageSiete= findViewById(R.id.imageSiete);
        viewImageOcho= findViewById(R.id.imageOcho);
        viewImageNueve= findViewById(R.id.imageNueve);
        viewImageIgual= findViewById(R.id.imageIgual);

        etProceso= (EditText)findViewById(R.id.etProceso);


        viewImageCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
                contador=1;
            }
        });
        viewImageUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");
                contador=1;
            }
        });
        viewImageDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
                contador=1;
            }
        });
        viewImageTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
                contador=1;
            }
        });
        viewImageCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
                contador=1;
            }
        });
        viewImageCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
                contador=1;
            }
        });
        viewImageSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
                contador=1;
            }
        });
        viewImageSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
                contador=1;
            }
        });
        viewImageOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
                contador=1;
            }
        });
        viewImageNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
                contador=1;
            }
        });
        viewImageComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador==0){
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    etProceso.setText(etconcatenar.getText().toString() + "0.");
                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    etProceso.setText(etconcatenar.getText().toString() + ".");
                }

            }
        });

        viewImagePorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    resultado = numero1 / 100;
                    etProceso.setText(String.valueOf(resultado));
                }
            }
        });

        viewImageIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero2 = Double.parseDouble(etconcatenar.getText().toString());
                    if(operador.equals("+")){
                        etProceso.setText("");
                        resultado= numero1 + numero2;
                    }
                    if(operador.equals("-")){
                        etProceso.setText("");
                        resultado = numero1 - numero2;
                    }
                    if(operador.equals("*")){
                        etProceso.setText("");
                        resultado = numero1 * numero2;
                    }
                    if(operador.equals("/")){
                        etProceso.setText("");
                        if(numero2 != 0){
                            resultado = numero1 / numero2;
                        }else {
                            etProceso.setText("Infinito");
                        }
                    }

                    etProceso.setText(String.valueOf(resultado));
                }
            }
        });

        viewImageSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "+";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        viewImageResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "-";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        viewImageMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "*";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }
            }
        });
        viewImageDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contador==0){

                } else {
                    operador = "/";
                    etconcatenar = (EditText)findViewById(R.id.etProceso);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etProceso.setText("");
                }

            }
        });
        viewImageAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }
}