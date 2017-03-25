/*
 * Copyright (C) 2017 Tanesh Manjrekar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Terminal;

/**
 *
 * @author Tanesh Manjrekar
 */
public class LoginTerminal 
{
    /*
    Making the constructor private and using a static method for creation of the terminal, 
    to ensure that at any given moment, there's only one instance of the Login Terminal
    */
    private LoginTerminal()
    {
        
    }
    
    public static void createLoginTerminal()
    {
        LoginTerminal lt = new LoginTerminal();
    }
}
