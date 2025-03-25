-- Eliminar la tabla usuario_rol si existe
DROP TABLE IF EXISTS usuario_rol;

-- Eliminar la tabla usuario si existe
DROP TABLE IF EXISTS usuario;

-- Eliminar la tabla rol si existe
DROP TABLE IF EXISTS rol;

-- Crear la tabla usuario
CREATE TABLE usuario (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    contrasenia TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL
);

-- Crear la tabla rol
CREATE TABLE rol (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT UNIQUE NOT NULL
);

-- Crear la tabla intermedia usuario_rol para la relación muchos a muchos
CREATE TABLE usuario_rol (
    usuario_id INTEGER,
    rol_id INTEGER,
    PRIMARY KEY (usuario_id, rol_id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE,
    FOREIGN KEY (rol_id) REFERENCES rol(id) ON DELETE CASCADE
);

-- Insertar roles en la tabla rol
INSERT INTO rol (nombre) VALUES
    ('Administrador'),
    ('Editor'),
    ('Usuario');

-- Insertar usuarios de ejemplo
INSERT INTO usuario (nombre, contrasenia, email) VALUES
    ('Juan Pérez', 'pass123', 'juan@example.com'),
    ('Ana López', 'securePass', 'ana@example.com'),
    ('Carlos Gómez', 'claveSegura', 'carlos@example.com');

-- Asignar roles a los usuarios (ejemplo)
INSERT INTO usuario_rol (usuario_id, rol_id) VALUES
    (1, 1), -- Juan Pérez es Administrador
    (2, 2), -- Ana López es Editor
    (3, 3), -- Carlos Gómez es Usuario
    (2, 3); -- Ana López también es Usuario
