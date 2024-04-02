package edu.sfsu.the_cocktail_database;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.sfsu.the_cocktail_database.models.DataModel;

public class MainActivity extends AppCompatActivity {

// test remove after commit

    // https://github.com/weatherpub/The-Cocktail-Database.git
    private static final String url = "https://thecocktaildb.com/api/json/v1/1/search.php?f=c";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ArrayList<DataModel> dataModel = new ArrayList<>();

        // res/layout/activity_main.xml
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}