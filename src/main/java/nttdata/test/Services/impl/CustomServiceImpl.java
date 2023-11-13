package nttdata.test.Services.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import nttdata.test.Models.Custom;
import nttdata.test.Services.CustomService;
import nttdata.test.ViewModels.Request.CustomRequest;
import nttdata.test.util.Constants;

@Service
public class CustomServiceImpl implements CustomService {

    @Override
    public Custom getCustomInfo(CustomRequest customRequest) {
        if (customRequest.getDocumentType().equals(Constants.allowDocumentType)
                && customRequest.getDocumentNumber().equals(Constants.allowDocument)) {
            return new Custom("Jose", "Reynaldo", "Vargas", "Gaitan", "3212184711", "Vereda Utapa", "Puente Nacional");
        }
        return null;
    }

}
