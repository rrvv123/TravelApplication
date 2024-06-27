package kr.ac.kopo.TravelApp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var ukBtn: Button
    lateinit var jpBtn: Button
    lateinit var finBtn: Button
    lateinit var ausBtn: Button
    lateinit var safeBtn: Button
    lateinit var weatherBtn: Button
    lateinit var exchangeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 각 버튼을 findViewById로 찾아서 변수에 저장
        ukBtn = findViewById(R.id.ukBtn)
        jpBtn = findViewById(R.id.jpBtn)
        finBtn = findViewById(R.id.finBtn)
        ausBtn = findViewById(R.id.ausBtn)
        safeBtn = findViewById(R.id.safeBtn)
        weatherBtn = findViewById(R.id.weatherBtn)
        exchangeBtn = findViewById(R.id.exchangeBtn)

        // 각 버튼에 OnClickListener 설정
        ukBtn.setOnClickListener(btnListener)
        jpBtn.setOnClickListener(btnListener)
        finBtn.setOnClickListener(btnListener)
        ausBtn.setOnClickListener(btnListener)
        safeBtn.setOnClickListener(btnListener)
        weatherBtn.setOnClickListener(btnListener)
        exchangeBtn.setOnClickListener(btnListener)
    }

    // 공통 OnClickListener 설정
    val btnListener = View.OnClickListener {
        var intent: Intent? = null

        when(it.id) {
            R.id.ukBtn -> intent = Intent(this@MainActivity, UKActivity::class.java)
            R.id.jpBtn -> intent = Intent(this@MainActivity, JPActivity::class.java)
            R.id.finBtn -> intent = Intent(this@MainActivity, FINActivity::class.java)
            R.id.ausBtn -> intent = Intent(this@MainActivity, AUSActivity::class.java)
            R.id.safeBtn -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.0404.go.kr"))
            R.id.weatherBtn -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.weather.go.kr"))
            R.id.exchangeBtn -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://finance.naver.com"))
        }
        if (intent != null) {
            startActivity(intent)
        }
    }
}
