package yamauchi.n.taskrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ListView設定テスト用
    private final String[] testList= {"aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii","jjj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView yaruList = findViewById(R.id.yarukoto_list);

        ListView yattaList = findViewById(R.id.yattakoto_list);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,testList);

        yaruList.setAdapter(arrayAdapter);

        yattaList.setAdapter(arrayAdapter);




    }
}
