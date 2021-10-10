/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;

/**
 *
 * @author lawde
 */
public class ArgumentNullException extends RuntimeException{
    public ArgumentNullException(String errorMessage){
        super(errorMessage);
    }
}
