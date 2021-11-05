package akakom.nomhs.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.rendang,"Honai","Dari Papua","Honai memiliki nilai menjaga kesatuan dan persatuan sesama suku, " +
                "serta mempertahankan budaya yang telah diwariskan oleh para leluhur untuk selamanya." +
                "Contoh kesatuan dan persatuan dalam Honai adalah rumah adat ini hanya boleh dibangun oleh laki-laki secara bergotong royong."))

        data?.add(DataModel(R.drawable.nasi_lemak,"Bolon","Batak", "Rumah adat suku Batak Toba disebut juga \"Rumah Bolon\". Rumah ini berbentuk panggung dengan bahan utama bangunan berupa kayu. Hal yang paling menarik perhatian adalah bentuk atapnya yang melengkung dan runcing di tiap ujungnya."))

        data?.add(DataModel(R.drawable.pizza,"Joglo","Dari Jawa Tengah", "Joglo menurut Kamus Besar Bahasa Indonesia (KBBI) adalah gaya bangunan untuk tempat tinggal khas Jawa yang atapnya menyerupai trapesium. " +
                "Rumah Joglo pun memiliki keunikan dari beberapa bagian bangunan. " +
                "Seperti pendopo, pringgitan, omah, senthong, pedepokan, saka."))

        data?.add(DataModel(R.drawable.spagetti,"Kajang Leko","Dari Jambi", "Rumah adat ini mempunyai keunikan tersendiri dalam arsitektur bangunannya.  " +
                "Pemilihan bentuk bangunan ini biasanya dihubungkan dengan banyak faktor termasuk budaya di masyarakat Jambi sendiri. " +
                "Rumah Kajang Leko ini berasal dari 60 tumbi atau keluarga yang pindah ke Koto Rayo."))

        data?.add(DataModel(R.drawable.martabak,"Gadang","Minangkabau", "Rumah Gadang utama biasanya dibangun di atas tanah yang cukup luas dan milik keluarag induk secara turun temurun."+
                "Bentuk arsitek bangunan rumah Gadang berupa bangunan balok segi empat, yang mengembang ke atas dan mengecil ke bawah."+
                "Garis melintang dari bangunan rumah Gadang melengkung tajam di sebelah dua tepinya, menyerupai tanduk kerbau. Bentuk yang menyerupai tanduk tersebut sebagai simbol kemenangan. Bentuk atap melengkung dan runcing ke atas yang disebut gonjong."))



        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.harga)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}