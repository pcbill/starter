package tw.pcbill

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PcbillApplication

fun main(args: Array<String>) {
    runApplication<PcbillApplication>(*args)
}
