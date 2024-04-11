export const Footer = () => {
  const year = new Date().getFullYear();

  return (
    <footer>
      <div className="text-center">
        <small className="copyright">&copy; Malick | Zeyna | Djiby | Dethie |{year}</small>
      </div>
    </footer>
  );
};
