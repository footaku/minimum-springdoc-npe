package com.example.minimumspringdocnpe;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/")
public class SampleController {

    @Operation(
        summary = "Summary",
        description = "This is description.",
        tags = {"Bug"},
        responses = {
            @ApiResponse(
                responseCode = "201",
                description = "201 (Created)",
                headers = {
                    @Header(
                        name = HttpHeaders.LOCATION,
                        description = "Sample endpoint",
                        schema = @Schema(implementation = URI.class)
                    )
                })
        }
    )
    @GetMapping
    public String get() {
        return "Hello World!";
    }
}
