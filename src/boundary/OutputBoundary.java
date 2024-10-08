package boundary;

import dto.ResponseData;
import dto.ResponseError;

public interface OutputBoundary {
    void showError(ResponseError error);
    void showMessage(ResponseData responseData);
}
