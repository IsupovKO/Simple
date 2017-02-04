package kurgan.isupov.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int countTap = 0;

    @Override   //аннотация @Override (переопределён из базового класса)
    protected void onCreate(Bundle savedInstanceState) {

        // super - суперкласс, класс от которого мы отнаследовались
        // Ключевое слово super можно использовать для вызова конструктора суперкласса и
        // для обращения к члену суперкласса, скрытому членом подкласса.
        // Вызов метода super() всегда должен быть первым оператором, выполняемым внутри конструктора подкласса
        super.onCreate(savedInstanceState);

        // подгружвем файл с разметкой
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        countTap++;
        TextView helloTextView = (TextView)findViewById(R.id.txtView);
        helloTextView.setText("Tap " + countTap);
    }
}
