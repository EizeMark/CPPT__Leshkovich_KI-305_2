# video/video_player.py

class VideoPlayer:
    """Базовый класс для воспроизведения видео."""
    
    def __init__(self, video_name):
        """
        Инициализация видео плеера с именем видео.
        :param video_name: Название видео файла
        """
        self.video_name = video_name
        self.is_playing = False

    def play(self):
        """Метод для начала воспроизведения видео."""
        self.is_playing = True
        print(f"Воспроизведение видео: {self.video_name}")

    def stop(self):
        """Метод для остановки воспроизведения видео."""
        self.is_playing = False
        print(f"Воспроизведение остановлено: {self.video_name}")
