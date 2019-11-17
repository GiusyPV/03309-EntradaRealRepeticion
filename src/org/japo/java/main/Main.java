/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        double numReal = 0.0;
        boolean realOk = false;

        do {
            try {

                System.out.print("Introduce un número real ...............: ");
                numReal = SCN.nextDouble();
                realOk = true;
                
            } catch (Exception e) {
                System.out.println("ERROR: El valor introducido no es válido.");
            } finally {
                SCN.nextLine();
            }

        } while (!realOk);
        
        System.out.printf(Locale.ENGLISH, "El número introducido es ...............: %.2f%n", numReal);

    }
}
