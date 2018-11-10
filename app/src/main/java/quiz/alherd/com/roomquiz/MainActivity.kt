package quiz.alherd.com.roomquiz

import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var frag1: FragmentQuiz? = null
    var fTrans: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frag1 = FragmentQuiz()
        supportFragmentManager.beginTransaction()
            .add(R.id.frgmCont, FragmentQuiz())
            .commit()
    }
}
