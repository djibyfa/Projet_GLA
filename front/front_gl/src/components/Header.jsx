import logo from "../assets/img/logo.png";

export const Header = ({ activeLink, onClickCallback }) => {
  return (
    <header className="header">
      <div className="top-bar container-fluid">
        {/* <div className="actions">
          
        </div>
        <ul className="social list-inline d-flex gap-2">
          <li>
            <a
              href="https://www.linkedin.com/authwall?trk=gf&trkInfo=AQE_kpt3Ti-s2wAAAW2I5dognmDD8csdgmJ69IMix-7FT0TYhUXReOm9sK8E6U8x5WHAVloC3TNU4wQpxH6zathz19VjLsyn9u7YGG_7_y-2hYcdDDthfOfa4J2xfGllKPxrqkw=&originalReferer=https://www.google.com/&sessionRedirect=https%3A%2F%2Fde.linkedin.com%2Fin%2Frobert-heinemann-0501a5193"
              target="_blank"
              rel="noreferrer"
            >
              <i className="fa fa-linkedin" aria-hidden="true"></i>
            </a>
          </li>
          <li>
            <a
              href="https://github.com/therobhe"
              target="_blank"
              rel="noreferrer"
            >
              <i className="fa fa-github-alt" aria-hidden="true"></i>
            </a>
          </li>
        </ul>*/}
      </div> 

      <div className="intro">
        <div className="container text-center">
          <img
            className="profile-image img-rounded"
            src={logo}
            width="200px"
            height="200px"
            alt="Logo Robert Heinemann"
          />
          <div className="title"><strong>ASSURE TECH: Gestion de l'assistance aux utilisateurs</strong></div>
        </div>
      </div>

      <div className="contact-info">
        <div className="container text-center">
          <ul className="list-inline d-flex justify-content-center">
            <li>
              <i className="fa fa-envelope"></i>
              <a href="milczo776@gmail.com">
                milczo776@gmail.com
              </a>
            </li>
            <li>
              <i className="fa fa-user"></i>Assure Texh
            </li>
            <li>
              <i className="fa fa-globe"></i>
              <a
                href="https://robhe.netlify.com"
                target="_blank"
                rel="noreferrer"
              >
                robhe.com
              </a>
            </li>
          </ul>
        </div>
      </div>

      <div className="page-nav-space-holder">
        <div id="page-nav-wrapper" className="page-nav-wrapper text-center">
          <div className="container">
            <ul id="page-nav" className="nav page-nav list-inline">
              <li>
                <div className={!activeLink ? "active" : undefined} onClick={() => onClickCallback(false)}>À propos de nous </div>
              </li>
              <li>
                <div className={activeLink ? "active" : undefined} onClick={() => onClickCallback(true)}>Avis Légal</div>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </header>
  );
};
