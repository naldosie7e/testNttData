package nttdata.test.Services;

import nttdata.test.Models.Custom;
import nttdata.test.ViewModels.Request.CustomRequest;

public interface CustomService {
    Custom getCustomInfo(CustomRequest customRequest);

}
