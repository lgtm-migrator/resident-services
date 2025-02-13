package io.mosip.resident.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;

public class VidAlreadyPresentException extends BaseUncheckedException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5320581589143112542L;

	public VidAlreadyPresentException() {
        super();
    }

    /**
     * Instantiates a new exception.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public VidAlreadyPresentException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }
}
