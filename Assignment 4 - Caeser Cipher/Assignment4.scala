object Assignment4{
    
    def main(args:Array[String]):Unit ={
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        
        val encrypt = (c:Char, key:Int, alp:String) => {
            val index = alp.indexOf(c.toUpper)
            if(index == -1) // To avoid space characters being encrypted
                c
            else
                alp((index + key) % alp.size)
        }

        val decrypt = (c:Char, key:Int, alp:String) => {
            val index = alp.indexOf(c.toUpper)
            if(index == -1) // To avoid space characters being decrypted
                c
            else{
                val newKey = ((-1*key)%alp.size) + alp.size
                alp((index + newKey) % alp.size)
                // Multiplied from -1 before using mod, So the actual key value can be calculated using the -Key
            }
        }

        val cipher = (func:(Char,Int,String)=>Char, pString:String, key:Int, alp:String) => {
            pString.map(func(_,key,alp))
        }

        val plainText = "university of colombo school of computing"
        val shiftKey = 5 //Key to be shifted
        
        val encryptedText = cipher(encrypt,plainText,shiftKey,alphabet) 
        println("Encrypted String -> " + encryptedText)
        val decryptedText = cipher(decrypt,encryptedText,shiftKey,alphabet)
        println("Decrypted String -> " + decryptedText)  
    }
}