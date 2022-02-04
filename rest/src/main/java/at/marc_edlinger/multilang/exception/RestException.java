package at.marc_edlinger.multilang.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestException extends Exception {

    private final int errorCode;
    private final String information;

}
