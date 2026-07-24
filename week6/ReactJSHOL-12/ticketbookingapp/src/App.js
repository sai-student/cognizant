import { useState } from "react";
import "./App.css";

import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let page;
  let button;

  if (isLoggedIn) {
    page = <UserPage />;
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    page = <GuestPage />;
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div className="app-container">
      {page}

      <div className="login-button">
        {button}
      </div>
    </div>
  );
}

export default App;