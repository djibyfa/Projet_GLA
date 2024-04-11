import React from 'react';
import "./login.css";
function Login() {
    return (
        <div className="logo-box">
            <img src="./logo.png" alt="apple" className="logo" />
            <h2><strong>Connectez-vous a Assure Tech</strong></h2>
            <form>
                <input type="text" placeholder="Nom d'utilsateur" /> <br />
                <input type="text" placeholder="Mot de passe" />
                <button>Next</button>
            </form>
            <button>Forget Password</button>
        </div>
    );
}

export default Login;
