package pro.nait.ytuber

import com.github.axet.vget.VGet
import org.springframework.stereotype.Service
import java.io.File;
import java.net.URL;

@Service
class YtuberService {
    fun Download(url: String) {
        try {
            val v = VGet(URL(url), File("/"))
            v.download()
        }
        catch (ex: Exception) {

        }
    }
}