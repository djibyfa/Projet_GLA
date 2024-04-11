import logo from "../assets/img/logo.png";

export const Main = () => {
  return (
    <main className="wrapper container">
      <section
        id="skills-section"
        className="skills-section section text-center"
      >
        <h2 className="section-title"><strong>Nos Services</strong></h2>
        <div className="other-skills">
          <div className="misc-skills">
            <span className="skill-tag">Reparation Ordinateurs</span>
            <span className="skill-tag">Controles du reseau informatique</span>
            <span className="skill-tag">Maintenance Informatique</span>
            <span className="skill-tag">Supervision Salle Informatique</span>
          </div>
        </div>
      </section>

      <section id="contact-section" className="contact-section section">
        <h2 className="section-title"><strong>Vous avez besoin de nous?</strong></h2>
        <div className="intro">
          <img
            className="profile-image img-rounded"
            src={logo}
            width="720"
            height="720"
            alt="Robert Heinemann"
          />
          <div className="dialog">
            <p>
              Allez ici pour soumettre votre demande:{" "}
              <a href="mailto:rheinemann97@t-online.de">
                Service
              </a>
            </p>
            {/* <p>or via:</p>
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
            </ul> */}
          </div>
        </div>
      </section>
    </main>
  );
};
