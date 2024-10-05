package com.github.takayoshi24.encryption_api.encryption;

import com.github.takayoshi24.Caesar;
import org.springframework.web.bind.annotation.*;

import javax.crypto.Cipher;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/encryption")
public class EncryptionController {

    @GetMapping(path = "/{message}")
    public String encrypt(@PathVariable String message,@RequestParam(required = false) Integer shift){

        Caesar caesar = new Caesar(Optional.ofNullable(shift).orElse(5));
        String encryptedMessage = caesar.encode(message);
        return encryptedMessage;
    }
}
